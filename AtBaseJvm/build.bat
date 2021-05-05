md .\out >NUL 2>&1
kotlinc -d ./out/AtBaseJvm.jar -cp .;./libs/AtSampleLib1.jar;./libs/AtSampleLib2.jar ./src/Main.kt ./src/com/apricottail/sample/*.kt
