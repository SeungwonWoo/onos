COMPILE_DEPS = CORE_DEPS + JACKSON + KRYO + CLI + [
    "//apps/kafka-integration/api:onos-apps-kafka-integration-api",
    "//core/store/serializers:onos-core-serializers",
    "@kafka_clients//jar",
    "@javax_ws_rs_api//jar",
    "//utils/rest:onlab-rest",
    "@com_google_protobuf//:protobuf_java",
    "//incubator/protobuf/models:onos-incubator-protobuf-models",
    "//incubator/protobuf/models/proto:onos-incubator-protobuf-models-proto",
]

osgi_jar_with_tests(
    api_description = "REST API for Kafka Integration",
    api_package = "org.onosproject.kafkaintegration.rest",
    api_title = "Kafka Integration",
    api_version = "1.0",
    test_deps = TEST_ADAPTERS,
    web_context = "/onos/kafka-integration",
    deps = COMPILE_DEPS,
)
