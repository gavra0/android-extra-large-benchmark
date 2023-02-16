#!/bin/bash
# usage `./apply_diff.sh 500`
MODULE_COUNT=$1
# 50 and 100 intentionally left out so it removes the max heap argument
# and falls back to default.
declare -A MAX_MEMORY=(
  ["200"]="-Xmx1100m"
  ["500"]="-Xmx3200m"
  ["1000"]="-Xmx6800m"
  ["app"]="-Xmx20000m"
  ["all"]="-Xmx60g"
)

cp "settings-$MODULE_COUNT.gradle" "settings.gradle"
sed -i "s/-Xmx\w*/${MAX_MEMORY[${MODULE_COUNT}]}/" "gradle.properties"
#TODO: Adjust the IDE memory in the sync scenario file too
