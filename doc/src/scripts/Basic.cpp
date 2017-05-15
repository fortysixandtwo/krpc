#include <iostream>
#include <krpc.hpp>
#include <krpc/services/krpc.hpp>

int main() {
  krpc::Client conn = krpc::connect();
  krpc::services::KRPC krpc(&conn);
  std::cout << "Connected to kRPC server version " << krpc.get_status().version() << std::endl;
}
