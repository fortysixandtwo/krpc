import krpc
conn = krpc.connect()
print('Server version =', conn.krpc.get_status().version)
