package shadow.adapters

import shadow.manager.DeviceManager

abstract class Adapter {

  abstract def identifier(value: Any): Identifier
  abstract def register(visitor: DeviceManager.DeviceVisitor)
}
