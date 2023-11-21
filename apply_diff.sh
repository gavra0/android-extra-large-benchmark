#!/bin/bash
# usage `./apply_diff.sh 500`
# usage `./apply_diff.sh 500 --remove-soft-references`
MODULE_COUNT=$1
REMOVE_SOFT_REFERENCES=$2
# 50 and 100 intentionally left out so it removes the max heap argument
# and falls back to default.
declare -A MAX_MEMORY=(
  ["200"]="-Xmx1100m"
  ["500"]="-Xmx3200m"
  ["1000"]="-Xmx6800m"
  ["app"]="-Xmx20000m"
  ["all"]="-Xmx60g"
)


REMOVE_SOFT_REFERENCES_FLAG="-XX:SoftRefLRUPolicyMSPerMB=0"

if [[ "$REMOVE_SOFT_REFERENCES" == "--remove-soft-references"* ]]; then
  if [[ "$OSTYPE" == "linux-gnu"* ]]; then
    AGENT_PATH="native/linux/liblightweight_heap_traverse.so"
  elif [[ "$OSTYPE" == "darwin"* ]]; then
    AGENT_PATH="native/mac/liblightweight_heap_traverse.dylib"
  fi

  sed -i "/^org\.gradle\.jvmargs=/s/\(${REMOVE_SOFT_REFERENCES_FLAG}\)\|$/ ${REMOVE_SOFT_REFERENCES_FLAG}/" gradle.properties
  echo "Soft referenced removed"
else
  sed -i "s/${REMOVE_SOFT_REFERENCES_FLAG}\S*//" "gradle.properties"
  echo "Soft references kept"
fi

cp "settings-$MODULE_COUNT.gradle" "settings.gradle"

sed -i "/^org\.gradle\.jvmargs=/s/\(-Xmx\w*\)\|$/ ${MAX_MEMORY[${MODULE_COUNT}]}/" gradle.properties
#TODO: Adjust the IDE memory in the sync scenario file too
