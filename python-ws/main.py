from flask import Flask, request
import py_eureka_client.eureka_client as eureka_client

app = Flask(__name__)

rest_port = 8050
eureka_client.init(eureka_server="http://localhost:8010/eureka",
                   app_name="flask-ws",
                   instance_port=rest_port)

app = Flask(__name__)


@app.route('/hello-flask')
def index():
    return 'Hello from flask Microservice!'


if __name__ == "__main__":
    app.run(host='0.0.0.0', port=rest_port)
