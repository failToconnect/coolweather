plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.coolweather.android"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.coolweather.android"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    // LitePal：数据库操作
    implementation("org.litepal.guolindev:core:3.2.3")

    // OkHttp：网络请求
    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    // Gson：JSON 数据解析
    implementation("com.google.code.gson:gson:2.11.0")

    // Glide：图片加载
    implementation("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.16.0")
    implementation(libs.activity.ktx)
    implementation(libs.appcompat)
    implementation(libs.constraintlayout)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.ext.junit)
}