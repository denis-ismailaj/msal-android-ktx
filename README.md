# MSAL Android KTX

This library provides some wrapper methods that allow callers to write idiomatic Kotlin code when
using [microsoft-authentication-library-for-android](https://github.com/AzureAD/microsoft-authentication-library-for-android).

To explore what is included in `msal-android-ktx`, have a look
at [this PR](https://github.com/AzureAD/microsoft-authentication-library-for-android/pull/2066).

## Installation

[![](https://jitpack.io/v/denis-ismailaj/msal-android-ktx.svg)](https://jitpack.io/#denis-ismailaj/msal-android-ktx)

1. Add the JitPack repository to your project's build or settings file

        dependencyResolutionManagement {
            ...
            repositories {
                ...
                maven("https://jitpack.io")
            }
        }

2. Add the `msal-android-ktx` dependency to your module's build file

        dependencies {
            ...
            implementation("com.github.denis-ismailaj:msal-android-ktx:0.1.0")
        }
