import com.apricottail.sample.common.AtCommon1
import com.apricottail.sample.common.AtCommon2

// プログラムに渡されたパラメータを表示する。
println("パラメータの一覧を表示します。")
args.forEach {
    println(it)
}
println("パラメータは以上です。")

// hello world を表示する。
AtCommon1.outMessage("hello world by AtCommon1.")
AtCommon2.outMessage("hello world by AtCommon2.")
Sub.outLine("hello world by AtSub.")

object Sub {
    fun outLine(msg: String) {
        println(msg)
    }
}
