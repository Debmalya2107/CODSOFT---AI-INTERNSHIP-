FROM python:3.10
WORKDIR /code
COPY ./requirements.txt /code/requirements.txt
RUN pip install --no-cache-dir --upgrade -r /code/requirements.txt
COPY . .
RUN mkdir -p static/uploads && chmod 777 static/uploads
CMD ["python", "app.py"]
