#!/bin/bash
# usage `./apply_diff.sh 500` this will disable the agent
# usage `./apply_diff.sh 500 --enable-agent`
MODULE_COUNT=$1
ENABLE_AGENT=$2
# 50 and 100 intentionally left out so it removes the max heap argument
# and falls back to default.
declare -A MAX_MEMORY=(
  ["200"]="-Xmx1100m"
  ["500"]="-Xmx3200m"
  ["1000"]="-Xmx6800m"
  ["app"]="-Xmx20000m"
  ["all"]="-Xmx60g"
)


if [[ "$ENABLE_AGENT" == "--enable-agent"* ]]; then
  if [[ "$OSTYPE" == "linux-gnu"* ]]; then
    AGENT_PATH="native/linux/liblightweight_heap_traverse.so"
  elif [[ "$OSTYPE" == "darwin"* ]]; then
    AGENT_PATH="native/mac/liblightweight_heap_traverse.dylib"
  fi

  ESCAPED_PATH=$(echo "${PWD}/${AGENT_PATH}" | sed 's/\//\\\//g')

  sed -i "/^org\.gradle\.jvmargs=/s/\(-agentpath[^ ]*\)\|$/ -agentpath:${ESCAPED_PATH}/" gradle.properties
  echo "Agent enabled"
else
  sed -i "s/-agentpath\S*//" "gradle.properties"
  echo "Agent disabled"
fi

cp "settings-$MODULE_COUNT.gradle" "settings.gradle"

sed -i "/^org\.gradle\.jvmargs=/s/\(-Xmx\w*\)\|$/ ${MAX_MEMORY[${MODULE_COUNT}]}/" gradle.properties
#TODO: Adjust the IDE memory in the sync scenario file too
