 docker exec -it docker_kafka_1 /bin/bash -c "kafka-topics --create --topic testMessage --partitions 1 --replication-factor 1 --if-not-exists --zookeeper zookeeper:2181"