[![official project](http://jb.gg/badges/official.svg)](https://github.com/JetBrains#jetbrains-on-github)

# Multiplatform library template

## What is it?

This repository contains a simple library project, intended to demonstrate a [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html) library that is deployable to [Maven Central](https://central.sonatype.com/).

The library has only one function: generate the [Fibonacci sequence](https://en.wikipedia.org/wiki/Fibonacci_sequence) starting from platform-provided numbers. Also, it has a test for each platform just to be sure that tests run.

Note that no other actions or tools usually required for the library development are set up, such as [tracking of backwards compatibility](https://kotlinlang.org/docs/jvm-api-guidelines-backward-compatibility.html#tools-designed-to-enforce-backward-compatibility), explicit API mode, licensing, contribution guideline, code of conduct and others. You can find a guide for best practices for designing Kotlin libraries [here](https://kotlinlang.org/docs/api-guidelines-introduction.html).

## Guide

Please find the detailed guide [here](https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-publish-libraries.html).

## Publishing this library to Maven Central

1. Put credentials in your **user-level** Gradle properties file (`~/.gradle/gradle.properties`), not in this repository:
   - `mavenCentralUsername=<your-central-portal-username>`
   - `mavenCentralPassword=<your-central-portal-token>`
   - `signing.keyId=<your-pgp-key-id>`
   - `signing.key=<ascii-armored-private-key-content>`
   - The signing key passphrase property required by Gradle signing
2. Set the release version in `library/build.gradle.kts`.
3. Run:
   - `./gradlew :library:publishAndReleaseToMavenCentral`
4. Verify published coordinates:
   - `io.github.raulhuertas:library:<version>`

## Check for gradle commands with a prefix
(e.g checkPomFileFile...)
```bash
 .\gradlew tasks --all | Select-String checkPomFileFor
```
# Other resources
* [Publishing via the Central Portal](https://central.sonatype.org/publish-ea/publish-ea-guide/)
* [Gradle Maven Publish Plugin \- Publishing to Maven Central](https://vanniktech.github.io/gradle-maven-publish-plugin/central/)
