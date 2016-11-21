//package com.server.xofome.ref;
//
//
//@RestController
//@RequestMapping(value = "/compras")
//public class BuyController {
//	
//	@Autowired
//	private IBuyService service;
//
//	
//	@RequestMapping(method = RequestMethod.GET)
//	public ResponseEntity<List<Compra>> findAll(){
//		
//		List<Compra> buyList = service.findAll();
//		
//		return new ResponseEntity<List<Compra>>(buyList, HttpStatus.OK);
//	}
//	
//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	public ResponseEntity<Compra> findOne(@PathVariable(value = "id") Long id){
//		Compra compra = service.findOne(id);
//		
//		return new ResponseEntity<Compra>(compra, HttpStatus.OK);
//	}
//	
//	@RequestMapping(method = RequestMethod.POST)
//	public ResponseEntity<Compra> save (@RequestBody Compra requestBuy){
//		Compra compra = service.save(requestBuy);
//		
//		return new ResponseEntity<Compra>(compra, HttpStatus.OK);
//	}
//	
//	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//	public ResponseEntity<Compra> update(@PathVariable(value = "id") Long id, @RequestBody Compra requestBuy){
//		
//		Compra compra = service.update(requestBuy);
//		
//		return new ResponseEntity<Compra>(compra, HttpStatus.OK);
//	}
//	
//	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) // o que importa é o value = "id"s TESTAR
//	public ResponseEntity<Void> delete(@PathVariable(value = "id") Long a){
//		service.delete(a);
//	
//		return new ResponseEntity<Void>(HttpStatus.OK);
//	}
//}
