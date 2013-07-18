# Apphance Android HelloWorld Example

This repository contains a working example of uTest Apphance in a very simple Android app. To build this project you have a few choices:

1. Build using Maven
2. Build using Gradle
3. Build manually using your IDE

Just follow a few simple steps to get started:

## Preparation Steps - Obtain an Apphance Key

### 1. Create a free account with uTest Apphance

Get started by visiting the [Apphance website](http://www.apphance.com) and clicking "Sign Up". Follow the process to sign up for an account by entering your information and choosing a password.

### 2. Add a new application within Apphance

If you just registered for a new account in step 1, you'll be taken to this step automatically. Alternatively, click the application drop down on the upper right-hand corner of the screen and choose "Add New".

Tell Apphance the name of your application and the platform on which it runs (iOS, Android, or Windows Phone).

### 3. Copy the Application Key

Once you've added a new application in Apphance, you'll be given a unique application key. You'll need to add this to your code in just a few minutes, so keep it readily available. (You can always retrieve this key later if you need it. It's available in the Apphance web panel within the "Settings" menu on the left.)

## Installation Steps

### 4. Download or clone this git repository to your local computer

You can either clone this repository or download a zip file - whichever works for you.

### 5. Import the project into your IDE

Import this project into your favorite IDE (e.g. Eclipse or Android Studio).

### 6. Open the MainActivity file

In your IDE, expand the project to see the included folders. Locate src -> com.example.helloworldapphanceintegration -> MainActivity.java. Double click on the MainActivity.java file to open it.

### 7. Place your app key in the MainActivity

In the MainActivity file, locate a line that looks like this:

	public static final String APP_KEY = "Your-Apphance-Application-Key-Goes-Here";

Replace the string *Your-Apphance-Application-Key-Goes-Here* with the application key from Step 3.

### 8. Compile and run your app 

#### With Maven Command Line:
	
	mvn clean install
	adb install target/helloworld-apphance-integration-1.0.apk 

#### With Gradle Command Line:

	gradle clean build
	adb install build/apk/AH-Android-Int-debug-unaligned.apk 

#### With your IDE

Simply compile and run the app like you would normally with your IDE. If you are not using Maven or Gradle, we have included a recent version of the Apphance library with this sample app.

## Manifest File

There are several additional Apphance settings in the manifest file as well. You can review these settings by opening AndroidManifest.xml from your project. For more information about the content of the manifest, please visit the [Android Pre-Production Library Tutorial](http://help.apphance.com/library-installation/android/tutorial-pre-production)

## Getting More Help

For more information about using Apphance, visit our online [help topics](http://help.apphance.com).  

If you have additional questions, email us at: [help@apphance.com](mailto:help@apphance.com)

## What is uTest Apphance?

uTest Apphance enables mobile developers to know precisely how their apps are working in the test lab and in the wild. A single library enables over-the-air app distribution, crash reports, in-app bug reports and user feedback. Now developers can discover in real time precisely what’s working – and what’s not – with their iOS, Android, and Windows Phone. Learn more by visiting [apphance.com](http://www.apphance.com).
