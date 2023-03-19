# kotlin-ir-plugin-template

Template project for building Kotlin compiler plugins using IR.

### Usage:

Run `./gradlew :publishToMavenLocal` 

And add these lines to any kotlin project:
```gradle

template {
    fileProperty.set(file "Readme.md")
    stringProperty = "fdas"
}

compileKotlin {
    outputs.upToDateWhen { false }
}


```

TODO: change `template` to something meaningful
