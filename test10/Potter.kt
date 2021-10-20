package test10

class Potter {
    //プロパティは保守性の高いコードを作成するためvalを使う
    //val変数は生成時に参照先のオブジェクトを確定しておく必要があるので宣言時に代入するか
    private val magics = mutableListOf<String>()
    //initブロックでの代入が必要
    init {
        //ここで初期化設定
    }


