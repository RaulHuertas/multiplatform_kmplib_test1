import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.vanniktech.mavenPublish)
}

group = "io.github.raulhuertas"
version = "1.0.0"

kotlin {
    jvm()
    androidLibrary {
        namespace = "io.github.raulhuertas.kotlin.fibonacci"
        compileSdk = libs.versions.android.compileSdk.get().toInt()
        minSdk = libs.versions.android.minSdk.get().toInt()

        withJava() // enable java compilation support
        withHostTestBuilder {}.configure {}
        withDeviceTestBuilder {
            sourceSetTreeName = "test"
        }

        compilerOptions {
            jvmTarget = JvmTarget.JVM_11
        }
    }
    iosArm64()
    iosSimulatorArm64()
    linuxX64()

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
        }

        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

mavenPublishing {
    publishToMavenCentral()

    signAllPublications()

    coordinates(group.toString(), "library", version.toString())

    pom {
        name = "multiplatform_kmplib_test1"
        description = "Kotlin Multiplatform Fibonacci library."
        inceptionYear = "2026"
        url = "https://github.com/RaulHuertas/multiplatform_kmplib_test1/"
        licenses {
            license {
                name = "Apache-2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                distribution = "repo"
            }
        }
        developers {
            developer {
                id = "RaulHuertas"
                name = "Raul Huertas"
                url = "https://github.com/RaulHuertas"
                email = "rax20037@gmail.com"
                organization = "rhuertas"
                organizationUrl = "https://github.com/RaulHuertas"
            }
        }
        scm {
            url = "https://github.com/RaulHuertas/multiplatform_kmplib_test1/"
            connection = "scm:git:git://github.com/RaulHuertas/multiplatform_kmplib_test1.git"
            developerConnection = "scm:git:ssh://git@github.com/RaulHuertas/multiplatform_kmplib_test1.git"
        }
    }
}
