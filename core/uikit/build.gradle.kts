plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply("$rootDir/plugins/android-commons.gradle")

android {
    namespace = "com.financeapp.uikit"
}

dependencies {

    api (Internal.coreKtx)
    api (Internal.runtimeKtx)
    api (Internal.activityCompose)
    api (platform(Internal.composeBom))
    api (Internal.composeUi)
    api (Internal.uiGraphics)
    api (Internal.uiToolingPreview)
    api (Internal.material3)
}