import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

class SparkBase(clusterUrl: String, appName: String) {
   private val conf = new SparkConf().setMaster(clusterUrl).setAppName(appName)
   val sc = new SparkContext(conf)
}
