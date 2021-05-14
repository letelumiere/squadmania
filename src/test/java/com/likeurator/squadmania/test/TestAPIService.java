package com.likeurator.squadmania.test;

public class TestAPIService {
    /*
import java.lang.reflect.Type;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInitializer;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplateHandler;

@Service
public class APIService<T> {
	private RestTemplate restTemplate;
	
	@Autowired
	public APIService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public void setInterceptors(List<ClientHttpRequestInterceptor> interceptors) {
		restTemplate.setInterceptors(interceptors);
	}

	public int hashCode() {
		return restTemplate.hashCode();
	}

	public List<ClientHttpRequestInterceptor> getInterceptors() {
		return restTemplate.getInterceptors();
	}

	public void setRequestFactory(ClientHttpRequestFactory requestFactory) {
		restTemplate.setRequestFactory(requestFactory);
	}

	public void setClientHttpRequestInitializers(List<ClientHttpRequestInitializer> clientHttpRequestInitializers) {
		restTemplate.setClientHttpRequestInitializers(clientHttpRequestInitializers);
	}

	public ClientHttpRequestFactory getRequestFactory() {
		return restTemplate.getRequestFactory();
	}

	public List<ClientHttpRequestInitializer> getClientHttpRequestInitializers() {
		return restTemplate.getClientHttpRequestInitializers();
	}

	public boolean equals(Object obj) {
		return restTemplate.equals(obj);
	}

	public void setMessageConverters(List<HttpMessageConverter<?>> messageConverters) {
		restTemplate.setMessageConverters(messageConverters);
	}

	public String toString() {
		return restTemplate.toString();
	}

	public List<HttpMessageConverter<?>> getMessageConverters() {
		return restTemplate.getMessageConverters();
	}

	public void setErrorHandler(ResponseErrorHandler errorHandler) {
		restTemplate.setErrorHandler(errorHandler);
	}

	public ResponseErrorHandler getErrorHandler() {
		return restTemplate.getErrorHandler();
	}

	public void setDefaultUriVariables(Map<String, ?> uriVars) {
		restTemplate.setDefaultUriVariables(uriVars);
	}

	public void setUriTemplateHandler(UriTemplateHandler handler) {
		restTemplate.setUriTemplateHandler(handler);
	}

	public UriTemplateHandler getUriTemplateHandler() {
		return restTemplate.getUriTemplateHandler();
	}

	public <T> T getForObject(String url, Class<T> responseType, Object... uriVariables) throws RestClientException {
		return restTemplate.getForObject(url, responseType, uriVariables);
	}

	public <T> T getForObject(String url, Class<T> responseType, Map<String, ?> uriVariables)
			throws RestClientException {
		return restTemplate.getForObject(url, responseType, uriVariables);
	}

	public <T> T getForObject(URI url, Class<T> responseType) throws RestClientException {
		return restTemplate.getForObject(url, responseType);
	}

	public <T> ResponseEntity<T> getForEntity(String url, Class<T> responseType, Object... uriVariables)
			throws RestClientException {
		return restTemplate.getForEntity(url, responseType, uriVariables);
	}

	public <T> ResponseEntity<T> getForEntity(String url, Class<T> responseType, Map<String, ?> uriVariables)
			throws RestClientException {
		return restTemplate.getForEntity(url, responseType, uriVariables);
	}

	public <T> ResponseEntity<T> getForEntity(URI url, Class<T> responseType) throws RestClientException {
		return restTemplate.getForEntity(url, responseType);
	}

	public HttpHeaders headForHeaders(String url, Object... uriVariables) throws RestClientException {
		return restTemplate.headForHeaders(url, uriVariables);
	}

	public HttpHeaders headForHeaders(String url, Map<String, ?> uriVariables) throws RestClientException {
		return restTemplate.headForHeaders(url, uriVariables);
	}

	public HttpHeaders headForHeaders(URI url) throws RestClientException {
		return restTemplate.headForHeaders(url);
	}

	public URI postForLocation(String url, Object request, Object... uriVariables) throws RestClientException {
		return restTemplate.postForLocation(url, request, uriVariables);
	}

	public URI postForLocation(String url, Object request, Map<String, ?> uriVariables) throws RestClientException {
		return restTemplate.postForLocation(url, request, uriVariables);
	}

	public URI postForLocation(URI url, Object request) throws RestClientException {
		return restTemplate.postForLocation(url, request);
	}

	public <T> T postForObject(String url, Object request, Class<T> responseType, Object... uriVariables)
			throws RestClientException {
		return restTemplate.postForObject(url, request, responseType, uriVariables);
	}

	public <T> T postForObject(String url, Object request, Class<T> responseType, Map<String, ?> uriVariables)
			throws RestClientException {
		return restTemplate.postForObject(url, request, responseType, uriVariables);
	}

	public <T> T postForObject(URI url, Object request, Class<T> responseType) throws RestClientException {
		return restTemplate.postForObject(url, request, responseType);
	}

	public <T> ResponseEntity<T> postForEntity(String url, Object request, Class<T> responseType,
			Object... uriVariables) throws RestClientException {
		return restTemplate.postForEntity(url, request, responseType, uriVariables);
	}

	public <T> ResponseEntity<T> postForEntity(String url, Object request, Class<T> responseType,
			Map<String, ?> uriVariables) throws RestClientException {
		return restTemplate.postForEntity(url, request, responseType, uriVariables);
	}

	public <T> ResponseEntity<T> postForEntity(URI url, Object request, Class<T> responseType)
			throws RestClientException {
		return restTemplate.postForEntity(url, request, responseType);
	}

	public void put(String url, Object request, Object... uriVariables) throws RestClientException {
		restTemplate.put(url, request, uriVariables);
	}

	public void put(String url, Object request, Map<String, ?> uriVariables) throws RestClientException {
		restTemplate.put(url, request, uriVariables);
	}

	public void put(URI url, Object request) throws RestClientException {
		restTemplate.put(url, request);
	}

	public <T> T patchForObject(String url, Object request, Class<T> responseType, Object... uriVariables)
			throws RestClientException {
		return restTemplate.patchForObject(url, request, responseType, uriVariables);
	}

	public <T> T patchForObject(String url, Object request, Class<T> responseType, Map<String, ?> uriVariables)
			throws RestClientException {
		return restTemplate.patchForObject(url, request, responseType, uriVariables);
	}

	public <T> T patchForObject(URI url, Object request, Class<T> responseType) throws RestClientException {
		return restTemplate.patchForObject(url, request, responseType);
	}

	public void delete(String url, Object... uriVariables) throws RestClientException {
		restTemplate.delete(url, uriVariables);
	}

	public void delete(String url, Map<String, ?> uriVariables) throws RestClientException {
		restTemplate.delete(url, uriVariables);
	}

	public void delete(URI url) throws RestClientException {
		restTemplate.delete(url);
	}

	public Set<HttpMethod> optionsForAllow(String url, Object... uriVariables) throws RestClientException {
		return restTemplate.optionsForAllow(url, uriVariables);
	}

	public Set<HttpMethod> optionsForAllow(String url, Map<String, ?> uriVariables) throws RestClientException {
		return restTemplate.optionsForAllow(url, uriVariables);
	}

	public Set<HttpMethod> optionsForAllow(URI url) throws RestClientException {
		return restTemplate.optionsForAllow(url);
	}

	public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity,
			Class<T> responseType, Object... uriVariables) throws RestClientException {
		return restTemplate.exchange(url, method, requestEntity, responseType, uriVariables);
	}

	public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity,
			Class<T> responseType, Map<String, ?> uriVariables) throws RestClientException {
		return restTemplate.exchange(url, method, requestEntity, responseType, uriVariables);
	}

	public <T> ResponseEntity<T> exchange(URI url, HttpMethod method, HttpEntity<?> requestEntity,
			Class<T> responseType) throws RestClientException {
		return restTemplate.exchange(url, method, requestEntity, responseType);
	}

	public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity,
			ParameterizedTypeReference<T> responseType, Object... uriVariables) throws RestClientException {
		return restTemplate.exchange(url, method, requestEntity, responseType, uriVariables);
	}

	public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity,
			ParameterizedTypeReference<T> responseType, Map<String, ?> uriVariables) throws RestClientException {
		return restTemplate.exchange(url, method, requestEntity, responseType, uriVariables);
	}

	public <T> ResponseEntity<T> exchange(URI url, HttpMethod method, HttpEntity<?> requestEntity,
			ParameterizedTypeReference<T> responseType) throws RestClientException {
		return restTemplate.exchange(url, method, requestEntity, responseType);
	}

	public <T> ResponseEntity<T> exchange(RequestEntity<?> entity, Class<T> responseType) throws RestClientException {
		return restTemplate.exchange(entity, responseType);
	}

	public <T> ResponseEntity<T> exchange(RequestEntity<?> entity, ParameterizedTypeReference<T> responseType)
			throws RestClientException {
		return restTemplate.exchange(entity, responseType);
	}

	public <T> T execute(String url, HttpMethod method, RequestCallback requestCallback,
			ResponseExtractor<T> responseExtractor, Object... uriVariables) throws RestClientException {
		return restTemplate.execute(url, method, requestCallback, responseExtractor, uriVariables);
	}

	public <T> T execute(String url, HttpMethod method, RequestCallback requestCallback,
			ResponseExtractor<T> responseExtractor, Map<String, ?> uriVariables) throws RestClientException {
		return restTemplate.execute(url, method, requestCallback, responseExtractor, uriVariables);
	}

	public <T> T execute(URI url, HttpMethod method, RequestCallback requestCallback,
			ResponseExtractor<T> responseExtractor) throws RestClientException {
		return restTemplate.execute(url, method, requestCallback, responseExtractor);
	}

	public <T> RequestCallback acceptHeaderRequestCallback(Class<T> responseType) {
		return restTemplate.acceptHeaderRequestCallback(responseType);
	}

	public <T> RequestCallback httpEntityCallback(Object requestBody) {
		return restTemplate.httpEntityCallback(requestBody);
	}

	public <T> RequestCallback httpEntityCallback(Object requestBody, Type responseType) {
		return restTemplate.httpEntityCallback(requestBody, responseType);
	}

	public <T> ResponseExtractor<ResponseEntity<T>> responseEntityExtractor(Type responseType) {
		return restTemplate.responseEntityExtractor(responseType);
	}
	
	
	
}
*/
}
