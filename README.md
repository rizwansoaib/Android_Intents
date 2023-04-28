# Android Intents

## [Download APK](https://github.com/rizwansoaib/Android_Intents/releases/download/v1/Intents.apk)
### [Code](https://github.com/rizwansoaib/Android_Intents/tree/master/app/src/main/java/com/example/intents)

# Introduction
      An Intent is a messaging object you can use to request an action from another app component
      
      
## Intent types

- ### Explicit intents 
   specify which application will satisfy the intent, by supplying either the target app's package name or a fully-qualified component class name. You'll typically use an explicit intent to start a component in your own app, because you know the class name of the activity or service you want to start. For example, you might start a new activity within your app in response to a user action, or start a service to download a file in the background.

- ### Implicit intents 
   do not name a specific component, but instead declare a general action to perform, which allows a component from another app to handle it. For example, if you want to show the user a location on a map, you can use an implicit intent to request that another capable app show a specified location on a map.

![Android intents image](https://developer.android.com/static/images/components/intent-filters_2x.png)

### [References](https://developer.android.com/guide/components/intents-filters)
