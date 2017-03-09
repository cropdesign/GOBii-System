System.register(["@angular/core", "../services/core/file-model-tree-service"], function (exports_1, context_1) {
    "use strict";
    var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
        var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
        if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
        else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
        return c > 3 && r && Object.defineProperty(target, key, r), r;
    };
    var __metadata = (this && this.__metadata) || function (k, v) {
        if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
    };
    var __moduleName = context_1 && context_1.id;
    var core_1, file_model_tree_service_1, MapsetsListBoxComponent;
    return {
        setters: [
            function (core_1_1) {
                core_1 = core_1_1;
            },
            function (file_model_tree_service_1_1) {
                file_model_tree_service_1 = file_model_tree_service_1_1;
            }
        ],
        execute: function () {
            MapsetsListBoxComponent = (function () {
                function MapsetsListBoxComponent(_fileModelTreeService) {
                    this._fileModelTreeService = _fileModelTreeService;
                    this.onMapsetSelected = new core_1.EventEmitter();
                } // ctor
                MapsetsListBoxComponent.prototype.handleMapsetSelected = function (arg) {
                    this.onMapsetSelected.emit(this.nameIdList[arg.srcElement.selectedIndex]);
                };
                MapsetsListBoxComponent.prototype.ngOnInit = function () {
                    return null;
                };
                return MapsetsListBoxComponent;
            }());
            MapsetsListBoxComponent = __decorate([
                core_1.Component({
                    selector: 'mapsets-list-box',
                    outputs: ['onMapsetSelected'],
                    inputs: ['nameIdList'],
                    template: "\n            <label class=\"the-label\">Add Mapset Info</label><BR>\n            <select name=\"mapsets\" (change)=\"handleMapsetSelected($event)\" >\n\t\t\t<option *ngFor=\"let nameId of nameIdList \" \n\t\t\t\tvalue={{nameId.id}}>{{nameId.name}}</option>\n\t\t</select>\n" // end template
                }),
                __metadata("design:paramtypes", [file_model_tree_service_1.FileModelTreeService])
            ], MapsetsListBoxComponent);
            exports_1("MapsetsListBoxComponent", MapsetsListBoxComponent);
        }
    };
});
//# sourceMappingURL=mapsets-list-box.component.js.map