import kotlin.math.sign

plugins {
    alias(libs.plugins.android.kotlin.multiplatform.library) apply false
    alias(libs.plugins.kotlinMultiplatform) apply  false
    alias(libs.plugins.vanniktech.mavenPublish) apply false
    id("maven-publish")
    id("signing") // 1. Add the signing plugin
}
// 2. Configure the signing block
signing {
    // This tells Gradle to use the signing.keyId, signing.password,
    // and signing.key properties we defined earlier.
    useInMemoryPgpKeys(
        providers.gradleProperty("signing.keyId").orNull,
        providers.gradleProperty("signing.key").orNull,
        providers.gradleProperty("signing.password").orNull
    )

    // Sign all publications (Android, iOS, JVM, JS, etc.)
    sign(publishing.publications)
}
