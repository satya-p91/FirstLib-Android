# FirstLib-Android
Learing how to create library in android and publish it to jitpack.

I created a simple library to show toast and snackbar. To use this library in your android projedct add following -

## In project level gradle file
```
allprojects {
   repositories{
       ...
       maven { url 'https://jitpack.io'}
   }
}
```
  
## In app level gradle file

```
dependencies {
   ...
   implementation 'com.github.satya-p91:TestingLibrary-Android:0.3'
}
```




#### Features :
- function to show Toast
- function to scankbar in Linear and relative layout
 
#### Class : 
   - ToastAndScackBar :-
   	 - showToast(context,message)
   	 - showSnackBarForLinearLayout(layout, message)
   	 - showSnackBarForRelativeLayout(layout, message)
