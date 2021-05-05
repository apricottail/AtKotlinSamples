#!/bin/sh
mkdir -p ./out
kotlinc -o ./out/AtBaseNative ./src/Main.kt ./src/com/apricottail/sample/*.kt
