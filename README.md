
<h1 align="center">MessageAndroidLibrary</h1></br>

<p align="center">
<img src="https://user-images.githubusercontent.com/24237865/50557081-fdd3a300-0d24-11e9-82e3-6ddad326cd40.png"/>
</p>
<p align="center">
An easy, flexible way to use the MessageAndroidLibrary for the Toast, Snackbar & AlertDialog
</p><br>


## Download
[![Maven Central](https://img.shields.io/maven-central/v/com.github.skydoves/androidveil.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.skydoves%22%20AND%20a:%22androidveil%22)
[![Jitpack](https://jitpack.io/v/skydoves/AndroidVeil.svg)](https://jitpack.io/#skydoves/AndroidVeil)
### Gradle
Add below codes to your **root** `build.gradle` file (not your module build.gradle file).
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
And add a dependency code to your **module**'s `build.gradle` file.
```gradle
dependencies {
    implementation 'com.github.e-kibet:MessagerAndroidLibrary:0.1.1'
}
```

## Implementation

### Direct Calling the classes
Add below code to your activity or fragment inside the class on the onCreate Function
```gradle
val messagerAndroidLibraryImpl: MessagerAndroidLibraryImpl = MessagerAndroidLibraryImpl()
```

To use the iToast or iSnackbar

```gradle

messagerAndroidLibraryImpl.iToast(context, "<<Your message should be here>>")

messagerAndroidLibraryImpl.iSnackbar(view, "<<Your message should be here>>")

```


### Injecting Using dependency injection
```gradle
@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    fun provideMessagerAndroidLibraryImpl() = MessagerAndroidLibraryImpl()
}
```




