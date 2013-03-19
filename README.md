Android-TamilUtil
=================

This library can be used to convert Unicode string to Bamini or TSCII.

Steps to use this library.

1. Download the library
2. Import the library into Eclipse as new Project
3. Add the library to your project as library (Right click -> Project -> Android -> Click "Add" button and select library.

This is a sample on how you can utilise the library

    // Initialise the Typeface (assumes TSCII / Bamini font located inside res/fonts folder
    Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/mylai.ttf");
    // Initialises the TextView
    TextView tv = (TextView)findViewById(R.id.textView1);
    //Setting the Typeface
    tv.setTypeface(tf);
    //Magic happens here ;)
    String TSCIIString = TamilUtil.convertToTamil(TamilUtil.TSCII, "வணக்கம் அன்ரொயிட்");
    //Setting the new string to TextView
    tv.setText(TSCIIString);

Final out put would look something like below

![Alt text](https://raw.github.com/mayooresan/Android-Tamil/master/final_output.png "Android Tamil")