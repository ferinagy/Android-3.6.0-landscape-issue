plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdkVersion(28)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    api("androidx.appcompat:appcompat:1.0.2")

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.41")
}

repositories {
    mavenCentral()
}
