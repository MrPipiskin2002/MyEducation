module appsource {
	requires transitive appsupport;
	exports queuesource.genqueue to appstart;
}