package com.rba.sonarqubedemo

object CodeSmell3 {

    fun abc_def(){
        if (2 > 1) {
            if (2 > 1) {
                if (2 > 1) {
                    if (2 > 1) {
                        print("cba 2>1")
                    }
                }
            }
        }
    }

}