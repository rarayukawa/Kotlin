class Address {
    public var name: String = "a"
    public var street: String = "b"
    public var city: String = "c"
    public var state: String? = "d"
    public var zip: String = "e"
}

fun copyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street
    result.city = address.city
    result.zip = address.zip
    return result
}
