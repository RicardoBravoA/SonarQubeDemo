package com.rba.sonarqubedemo

class CodeSmell2 {

    fun smell_2() {
        if (2 > 0) {
            if (2 > 0) {
                if (2 > 0) {
                    if (2 > 0) {
                        print("2>0")
                    }
                }
            }
        }
    }

}