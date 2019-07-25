plugins {
    id("com.android.application")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "com.example.landscape.test"
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"

    }

}

dependencies {
    api(project(":testmodule"))
}
