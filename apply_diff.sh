#!/bin/bash
# usage `./apply_diff.sh 500`
MODULE_COUNT=$1
declare -A MAX_MEMORY=(
  ["50"]="400m"
  ["100"]="600m"
  ["200"]="1300m"
  ["500"]="4000m"
  ["1000"]="9000m"
  ["app"]="20000m"
  ["all"]="60g"
)

cp "settings-$MODULE_COUNT.gradle" "settings.gradle"
sed -i "s/-Xmx\w*/-Xmx${MAX_MEMORY[${MODULE_COUNT}]}/" "gradle.properties"
#TODO: Adjust the IDE memory in the sync scenario file too
