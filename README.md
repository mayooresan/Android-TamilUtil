Android-TamilUtil
=================

Most of the pre ICS Android devices do not support Unicode Tamil. As the result, TypeFace is used with non-unicode fonts to display Tamil in Android applications. Often contents available in UTF-8 as Unicode is the universal standard now. This library will help you to covert Unicode string to non-unicode string with just few lines of code.

Following are the supported encodings

1. Bamini
2. Anjal
3. TAB
4. TAM
5. TSCII


Steps to use this library.

1. Download the library / jar (for Android Studio)
2. Import the library into Eclipse as new Project / Add the jar file into Android Studio's Lib folder
3. Add the library to your project as library (Right click -> Project -> Android -> Click "Add" button and select this library.) / (Right Click -> Add as Library)

This is a sample on how you can utilise the library

    // Initialise the Typeface (assuming that TSCII, Bamini, Anjal, TAB or TAM font located inside assets/fonts folder)
    Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/mylai.ttf");
    // Initialises the TextView
    TextView tv = (TextView)findViewById(R.id.textView1);
    //Setting the Typeface
    tv.setTypeface(tf);
    //Magic happens here ;) encoding conversion
    String TSCIIString = TamilUtil.convertToTamil(TamilUtil.TSCII, "வணக்கம் அன்ரொயிட்");
    //Setting the new string to TextView
    tv.setText(TSCIIString);

Final out put would look something like below

![Screen Shot Tamil Unicode Converter Utill](https://raw.github.com/mayooresan/Android-TamilUtil/master/ScreenShot.png "Android Tamil")

if you are using Android Studio, please [download the jar](https://github.com/mayooresan/Android-TamilUtil/blob/master/tamilutillib.jar?raw=true) and placed it inside your lib folder as incorporating the Androd Library built on Eclipse ADT may cause issues on Android Studio.

Inspired by [Tamil Visai](https://github.com/thamizha/android-tamilvisai) and [Pongu thamizh by Suratha](http://www.suratha.com/reader.htm). 

Special thanks to [Mauran](http://mauran.blogspot.com/) for sharing the conversion code for TAB, TAM and Anjal
