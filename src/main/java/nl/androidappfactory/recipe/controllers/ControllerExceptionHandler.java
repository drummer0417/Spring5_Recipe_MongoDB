package nl.androidappfactory.recipe.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;

//@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {

	// @ResponseStatus(HttpStatus.NOT_FOUND)
	// @ExceptionHandler(NotFoundException.class)
	// public ModelAndView handleNotFound(Exception exception) {
	// log.debug("log error: NotFoundException: ");
	//
	// ModelAndView modelAndView = new ModelAndView();
	// modelAndView.setViewName("404error");
	// modelAndView.addObject("exception", exception);
	//
	// return modelAndView;
	// }
	//
	// @ResponseStatus(HttpStatus.BAD_REQUEST)
	// @ExceptionHandler(NumberFormatException.class)
	// public ModelAndView handleNumberFormatException(Exception exception) {
	// log.debug("log error: NumberFormatException");
	// log.debug("exception: " + exception.getMessage());
	//
	// ModelAndView modelAndView = new ModelAndView();
	// modelAndView.setViewName("400error");
	// modelAndView.addObject("text", "You entered an invalid format. It should be a number");
	// modelAndView.addObject("exception", exception);
	//
	// return modelAndView;
	// }
	//
	// @ResponseStatus(HttpStatus.BAD_REQUEST)
	// @ExceptionHandler(BindException.class)
	// public ModelAndView handleBindException(Exception exception) {
	// log.debug("log error: Bind Exception (root: NumberFormatExceptionn)");
	//
	// ModelAndView modelAndView = new ModelAndView();
	// modelAndView.setViewName("400error");
	// modelAndView.addObject("text", "Invalid value! It should be a number");
	// modelAndView.addObject("exception", exception);
	//
	// return modelAndView;
	// }

}
