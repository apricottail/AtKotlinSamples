import com.apricottail.sample.Sub

fun main(args: Array<String>) {
    // プログラムに渡されたパラメータを表示する。
    println("パラメータの一覧を表示します。")
    args.forEach {
        println(it)
    }
    println("パラメータは以上です。")

    // hello world を表示する。
    Sub.outLine("hello world by AtSub.")
}
