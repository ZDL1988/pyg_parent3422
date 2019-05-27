// 定义服务层:
app.service("allOrderService",function($http){


    this.fh = function(ids){
        return $http.get("../allorder/fh.do?ids="+ids);
    }
	this.search = function(page,rows,searchEntity){
		return $http.post("../allorder/search.do?pageNum="+page+"&pageSize="+rows,searchEntity);
	}

});