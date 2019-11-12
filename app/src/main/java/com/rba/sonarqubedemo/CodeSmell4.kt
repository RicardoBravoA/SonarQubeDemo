package com.rba.sonarqubedemo

object CodeSmell4 {

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