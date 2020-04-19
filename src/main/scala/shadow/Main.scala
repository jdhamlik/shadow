package shadow

import shadow.adapters.vantage.VantageAdapter
import shadow.manager.DeviceManager

object Main {
  def main(args: Array[String]): Unit = {
    val manager = new DeviceManager
    val adapter = new VantageAdapter

    manager.register(adapter)
  }
}
