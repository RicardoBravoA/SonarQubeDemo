package com.rba.sonarqubedemo

class CodeSmell6 {

    fun smell_2() {
        if (2 > 0) {
            if (2 > 0) {
                if (2 > 0) {
                    if (2 > 0) {
                        print("cba 2>0")
                    }
                }
            }
        }
    }

}