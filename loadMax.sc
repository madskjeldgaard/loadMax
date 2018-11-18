/************************************ 

Simple class to load a 
file in Max. OSX only.

Usage: "path/to/maxfile.maxpat".loadMax

*************************************/

+ String {
    loadMax{
        "open -a Max %".format(this).unixCmd;
    }
}
