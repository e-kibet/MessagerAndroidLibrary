
object BuildPlugins {
    val androidPluggin by lazy { "com.android.tools.build:gradle:7.0.2" }

    val kotlinGradlePluggin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21" }

    val detektPluggin by lazy { "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.17.0" }

    val daggerHiltPluggin by lazy { "com.google.dagger:hilt-android-gradle-plugin:2.38.1" }

}

object Deps {
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}" }
    val materialDesign by lazy { "com.google.android.material:material:${Versions.material}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }
    val junit by lazy { "junit:junit:${Versions.jUnit}" }
    val testExtUnit by lazy { "androidx.test.ext:junit:1.1.3" }
    val testEspresso by lazy { "androidx.test.espresso:espresso-core:3.4.0" }

    val daggerHilt by lazy { "com.google.dagger:hilt-android:2.38.1" }
    val kaptDaggerHiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:2.38.1" }
}