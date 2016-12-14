# ListMulti
More than one type of object field list type.

##Installation

To use the library, first include it your project using Gradle

        allprojects {
            repositories {
                jcenter()
                maven { url "https://jitpack.io" }
            }
        }
and:

        dependencies {
                compile 'com.github.10uroi:ListMulti:1.0.0'
        }
        
##How to use
    
### MultiList
    MultiList<String,Integer> multiList = new MultiList<>();
    
    multiList.add("Onur",123);
    multiList.add("Ciner",456);
  
    multiList.getOneData(0); //Onur
    multiList.getTwoData(0); //123

    multiList.getOneData(1); //Ciner
    multiList.getTwoData(1); //456

    multiList.size(); //2

    multiList.getOneArrayList(); // ArrayList<String>   -> Onur, Ciner
    multiList.getTwoArrayList(); // ArrayList<Integer>  -> 123, 456

### MultiListThree
    MultiListThree<String,Integer,Boolean> multiList = new MultiListThree<>();
    
    multiList.add("Onur",123,true);
    multiList.add("Ciner",456,false);
  
    multiList.getOneData(0);    //Onur
    multiList.getTwoData(0);    //123
    multiList.getThreeData(0);  //true

    multiList.getOneData(1);    //Ciner
    multiList.getTwoData(1);    //456
    multiList.getThreeData(1);  //false

    multiList.size(); //2

    multiList.getOneArrayList();    // ArrayList<String>   -> Onur, Ciner
    multiList.getTwoArrayList();    // ArrayList<Integer>  -> 123, 456
    multiList.getThreeArrayList();  // ArrayList<Boolean> -> true, false
    
### MultiListFour
    MultiListFour<String,Integer,Boolean, Object> multiList = new MultiListFour<>();
    
    multiList.add("Onur",123,true, address1);
    multiList.add("Ciner",456,false,address2);
  
    multiList.getOneData(0);    //Onur
    multiList.getTwoData(0);    //123
    multiList.getThreeData(0);  //true
    multiList.getFourData(0);  //address1

    multiList.getOneData(1);    //Ciner
    multiList.getTwoData(1);    //456
    multiList.getThreeData(1);  //false
    multiList.getFourData(1);  //address2

    multiList.size(); //2

    multiList.getOneArrayList();    // ArrayList<String>   -> Onur, Ciner
    multiList.getTwoArrayList();    // ArrayList<Integer>  -> 123, 456
    multiList.getThreeArrayList();  // ArrayList<Boolean> -> true, false
    multiList.getFourArrayList();  // ArrayList<Object> -> address1, address2
    
### MultiListFive and MultiListSix -> Supports five and six parameters
