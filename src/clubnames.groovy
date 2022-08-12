class clubnames {

    def names =[
            "Arsenal",
            "Chelsea",
            "Manchester United",
            "Brentford"
    ]

    def getRandom() {

        3.times {
            Collections.shuffle names
        }
        return  names.first()
    }
    
    def GetLength(String a)
    {
        return a.length()
    }

}


//a=new clubnames().getRandom()
//println(a)
