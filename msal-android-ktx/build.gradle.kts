plugins {
    id("com.android.library")
    kotlin("android")
    id("maven-publish")
}

publishing {
    publications {
        register<MavenPublication>("release") {
            afterEvaluate {
                from(components["release"])
            }
        }
    }
}

android {
    namespace = "com.microsoft.identity.client.ktx"
    compileSdk = 34

    defaultConfig {
        minSdk = 21

        consumerProguardFiles()
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt")
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("com.microsoft.identity.client:msal:5.2.0") {
        exclude(group = "com.microsoft.device.display")
    }
}