module customer.profile{
	exports com.empresa.customer.profile.publico;
	requires transitive customer.orders;
}