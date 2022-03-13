export default class Spinner {
    #spinnerEl
    constructor(spin) {
        this.#spinnerEl = document.getElementById(spin);
    }
async runSpinner(waitFn){
    this.#startSpinner()
    const waiting=await waitFn;
    this.#stopSpinner()
    return waitFn
    }


    #startSpinner () {
        this.#spinnerEl.innerHTML = `  <div class="d-flex justify-content-center">
        <div class="spinner-border " role="status">
          <span class="visually-hidden">Loading...</span>
        </div>
        </div>`
    }
    #stopSpinner () {
        this.#spinnerEl.innerHTML = ""
    }
    
    }