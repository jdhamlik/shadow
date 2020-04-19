package shadow.manager

import shadow.adapters.{Adapter, Device, Identifier}

object DeviceManager {

  class DeviceVisitor(manager: DeviceManager) {

    def registerDevice(device: Device): Unit = {
      manager.devices += (device.identifier() -> device)
    }
  }
}

class DeviceManager {

  import shadow.manager.DeviceManager.DeviceVisitor

  var devices: Map[Identifier, Device] = Map()

  def register(adapter: Adapter): Unit = {
    adapter.register(new DeviceVisitor(this))
  }

  def device(identifier: Identifier): Device = {
    devices(identifier)
  }
}
