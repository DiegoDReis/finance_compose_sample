plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

apply("$rootDir/plugins/android-commons.gradle")
apply("$rootDir/plugins/core-dependencies.gradle")

android {
    namespace = "com.financeapp"
    defaultConfig {
        applicationId = "com.financeapp"
    }
}

dependencies {

    implementation (Internal.coreKtx)
    implementation (Internal.runtimeKtx)
    implementation (Internal.activityCompose)
    implementation (platform(Internal.composeBom))
    implementation (Internal.composeUi)
    implementation (Internal.uiGraphics)
    implementation (Internal.uiToolingPreview)
    implementation (Internal.material3)
    testImplementation (Test.junit)
    androidTestImplementation (Test.junitAndroid)
    androidTestImplementation (Test.espressoCore)
    androidTestImplementation (platform(Test.composeBom))
    androidTestImplementation (Test.composeUiTest)
    debugImplementation (Debug.uiTooling)
    debugImplementation (Debug.uiTestManifest)
}