package shadow.adapters

abstract class Identifier {

  abstract def adapter(): Adapter
  abstract def value(): Any
}
