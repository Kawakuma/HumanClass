package jp.techacademy.kentaro.kawamura.kotlinloghuman
  import android.util.Log

 class Human: Animal,Thinkable{
    constructor(name:String,age:Int,hobby:String): super(name,age){
        this.hobby=hobby
    }

    override fun say() {
        Log.d("kotlintest","私の名前は"+this.name+"です。年は"+this.age+"歳です。")
    }

     var hobby:String


     override fun think(){
        Log.d("kotlintest","私は"+hobby+"について考える。")
    }

}
