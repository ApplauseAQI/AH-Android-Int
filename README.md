# Apphance Android HelloWorld Example

This repository contains a working example of uTest Apphance in a very simple Android app. To compile this example, you'll first need to install [Eclipse](http://www.eclipse.org/) and the [Android SDKs](http://developer.android.com/sdk/index.html). When installing the Android SDKs, be mindful that this example has been configured to use Android version 2.1 (API 7) by default. 

## Installation Steps

### 1. Create a free account with uTest Apphance

Get started by visiting the [Apphance website](http://www.apphance.com) and clicking "Sign Up". Follow the process to sign up for an account by entering your information and choosing a password.

### 2. Add a new application within Apphance

If you just registered for a new account in step 1, you'll be taken to this step automatically. Alternatively, click the application drop down on the upper right-hand corner of the screen and choose "Add New".

Tell Apphance the name of your application and the platform on which it runs (iOS, Android, or Windows Phone).

### 3. Copy the Application Key

Once you've added a new application in Apphance, you'll be given a unique application key. You'll need to add this to your code in just a few minutes, so keep it readily available. (You can always retrieve this key later if you need it. It's available in the Apphance web panel within the "Settings" menu on the left.)

### 4. Download or clone this git repository to your local computer

You can either clone this repository or download a zip file - whichever works for you.

### 5. Import the project into Eclipse

Once you have downloaded the repository to your computer, open Eclipse and choose File -> Import. Select "Android" and then "Existing Android Code Into Workspace". Hit Next and then browse to the path of the repository you just downloaded. Click Finish to complete the importing process.

### 6. Open the MainActivity file

Expand the project to see the included folders. Locate src -> com.example.helloworldapphanceintegration -> MainActivity.java. Double click on the MainActivity.java file to open it.

### 7. Place your app key in the MainActivity

Locate a line that looks like:

<code>
	public static final String APP_KEY = "Your-Apphance-Application-Key-Goes-Here";
</code>

Replace the string *Your-Apphance-Application-Key-Goes-Here* with the application key from Step 3.

### 8. Compile and run your app

Click on the green Run arrow in the toolbar. If everything is setup correctly, this very basic application should compile and load in a simulator.

For more help, take a look at our online instructions for configuring [Apphance with your Android apps](http://help.apphance.com/library-installation/android/).

## Manifest File

There are several additional Apphance settings in the manifest file as well. You can review these settings by opening AndroidManifest.xml from your project. For more information about the content of the manifest, please visit the [Android Pre-Production Library Tutorial](http://help.apphance.com/library-installation/android/tutorial-pre-production)

## Getting More Help

For more information about using Apphance, visit our online [help topics](http://help.apphance.com).  

If you have additional questions, email us at: [help@apphance.com](mailto:help@apphance.com)

## What is uTest Apphance?

uTest Apphance enables mobile developers to know precisely how their apps are working in the test lab and in the wild. A single library enables over-the-air app distribution, crash reports, in-app bug reports and user feedback. Now developers can discover in real time precisely what’s working – and what’s not – with their iOS, Android, Windows Phone, Kindle Fire and Nook apps. Learn more by visiting [apphance.com](http://www.apphance.com).